#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int priority(char x)
{
	switch(x)
	{
		case '(':
			return 0;
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return 0;
	}
}
void infix_to_postfix(stack *s,char infix[],char postfix[])
{
	int i,p=0;
	char symbol,next;
	for(i=0;infix[i]!='\0';i++)//read each symbol of infix[] from left to right
	{
		symbol=infix[i];//reading symbol
		switch(symbol)
		{
			case '(':
				push(s,symbol);//if read symbol is '(' we push it onto stack s
				break;
			case ')':
				while((next=pop(s))!='(')//if the symbol is ')' pop untill '(' from stack
					postfix[p++]=next;//then adding these symbols to postfix[]
				break;
			case '+':
			case '-':
			case '*':
			case '/':
			case '^':
				while(priority(s->data[s->top])>=priority(symbol))
					postfix[p++]=pop(s);//chech top of stack s, if its priority is greater or eqal to priority of symbol, it pop & add to postfix
				push(s,symbol);//at last push the operator symbol to stack
				break;
			default:postfix[p++]=symbol;//for operand  directly add to postfix
		}
	}

	while(!isempty(s))//if any symbol remain instack after reading infix[], add those to postfix
		postfix[p++]=pop(s);
	postfix[p]='\0';
}
void main()
{
 stack *s;
 s=(stack*)malloc(sizeof(stack));
 char infix[20],postfix[20];

 s->top=-1;
    printf("\nEnter infix expression : ");
    scanf("%s",infix);
    infix_to_postfix(s,infix,postfix);
	printf("\npostfix expression of %s is %s",infix,postfix);
}
