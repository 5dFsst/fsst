#include<stdio.h>
#include<conio.h>

//int zweierPotenz(int hochzahl);
int bitCount(unsigned char value);
int zweierPotenz(int hochzahl);
void bitSet(unsigned char& v, int index);

int main()
{
	unsigned char a = 6;

	printf("\n%d", bitCount(a));
	printf("\n%d", zweierPotenz(a));
	bitSet(a, 0);
	printf("\n%d", a);
	printf("\n%d", zweierPotenz(a));
	_getch();
	return 0;
}

int zweierPotenz(int hochzahl)
{
	unsigned int zahl = 1;
	zahl <<= hochzahl;	//zahl = zahl << hochzahl;	
	return zahl;
}

void bitSet(unsigned char& v, int index)
{
	unsigned char bitmask = 1;
	v = v | (bitmask << index);
}

/*void bitSet(unsigned char& value, unsigned char bitpos)
{
	unsigned char bit_mask = 1 << bitpos;

	value = value | bit_mask;
}*/

int bitCount(unsigned char value)
{
	unsigned int count = 0;
	unsigned int bit_mask = 1;
	for (int i = 0; i < 8; i++)
	{
		if ((bit_mask << i) & value)
		{
			count++;
		}
	}
	return count;
}
/*
bool isEven(int value)
{
	bool temp = true;
	if (value & 1)		//(value & 1)==1
		temp = false;
	return temp;
}*/
