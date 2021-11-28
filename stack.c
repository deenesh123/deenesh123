#include<stdio.h>
#include<stdlib.h>
#define size 3
typedef struct
{
	int data[size];
	int top;
}stack;

int isfull(stack *s)
{
	if(s->top==size-1)
		return 1;
	else
		return 0;
}
int isempty(stack *s)
{
	if(s->top==-1)
		return 1;
	else
		return 0;
}
void push(stack *s,int item)
{
	if(isfull(s))
	{
		printf("\nstack overflow\n");
		return;
	}
	else
	{
		s->top++;
		s->data[s->top]=item;
	}
}
int pop(stack *s)
{
	int x;
	if(isempty(s))
	{
		printf("\nstack underflow\n");
		return -1;
	}
	else
	{
		x=s->data[s->top];
		s->top--;
		return x;
	}
}
int peep(stack *s)
{
	int x;
	if(isempty(s))
	{
		printf("\nstack underflow\n");
		return -1;
	}
	else
	{
		x=s->data[s->top];
	//	s->top--;
		return x;
	}
}
int main()
{
	int item;
	stack *s=(stack*)malloc(sizeof(stack));
	s->top=-1;//initially stack is empty
	int op;
	while(1)
	{
		printf("\n1.push\n");
		printf("2.pop\n");
		printf("3.peep\n");
		printf("4.exit\n");
		printf("enter option : ");
		scanf("%d",&op);
		switch(op)
		{
			case 1:
				printf("enter item : ");
				scanf("%d",&item);
				push(s,item);
				break;
			case 2:
				item=pop(s);
				if(item!=-1)
					printf("popped item = %d\n",item);
				break;
			case 3:
				item=peep(s);
				if(item!=-1)
					printf("peeped item = %d\n",item);
				break;
			case 4:
				exit(0);
				break;
			default:
				printf("invalid option");
		}
	};
	return 0;
}
