class SciCal
{
	public static void main (String[] args)
	{

		//SciCal Functions

		//Function001:	CLR

		//Function002:	DEL

		//Function003:	INS

		//Function004:	AC

		//Function005:	OFF

		//Function006:	x

		//Function007:	nPr

		//Function008:	/

		//Function009:	nCr

		//Function010:	STAT

		//Function011:	VERIFY

		//Function012:	+

		//Function013:	Pol

		//Function014:	-

		//Function015:	Rec

		//Function016:	Rnd

		//Function017:	Ran#

		//Function018:	RanInt

		//Function019:	Pi

		//Function020:	e

		//Function021:	*10(^x)

		//Function022:	DRG

		//Function023:	Ans

		//Function024:	=

		//Function025:	Mode

		//Function026:	SetUp

		//Function027:	ON

		//Function026:	Abs

		//Function027:	x(^3)

		//Function028:	:

		//Function029:	x(^-1)

		//Function030:	x!

		//Function031:	logx(y)

		//Function032:	x/y

		//Function033:	x(y/z)

		//Function034:	ROOT(x)

		//Function035:	CubedROOT(x)

		//Function036:	x(^2)

		//Function037:	RepeatingDecimal

		//Function038:	x(^y)

		//Function039:	[x]Root(y)

		//Function040:	log

		//Function041:	10(^x)

		//Function042:	ln

		//Function043:	e(^x)

		//Function044:	(-)

		//Function045:	A

		//Function046:	DegreesMinutesSeconds

		//Function047:	FACT

		//Function048:	B

		//Function049:	hyp

		//Function050:	C

		//Function051:	sin

		//Function052:	sin(^-1)

		//Function053:	D

		//Function054:	cos

		//Function055:	cos(^-1)

		//Function056:	E

		//Function057:	tan

		//Function058:	tan(^-1)

		//Function059:	F

		//Function060:	RCL

		//Function061:	STO

		//Function062:	ENG

		//Function063:	BackArrow

		//Function064:	(

		//Function065:	%

		//Function066:	)

		//Function067:	,

		//Function068:	X

		//Function069:	ChangingDisplayofAnswer

		//Function070:	Y

		//Function071:	ChangeFromx(y/z)to(a/z)AndViceversa

		//Function072:	M+

		//Function073:	M-

		//Function074:	M

		//47 Buttons


		//Mode01-075:	COMP


		//Mode02-076:	STAT

		//Mode02Function01-077:	1-VAR

		//Mode02Function02-078:	a+bX

		//Mode02Function03-079:	_+cX(^2)

		//Mode02Function04-078:	ln(X)

		//Mode02Function05-079:	e(^X)

		//Mode02Function06-080:	a*b(^X)

		//Mode02Function07-081:	a*X(^b)

		//Mode02Function08-082:	1/X


		//Mode03-083:	TABLE


		//Mode04-084:	VERIF


		//SetUp01-085:	MthIO

		//SetUp01Format01-086:	MathO

		//SetUp01Format02-087:	LineO


		//SetUp02-088:	LineIO


		//SetUp03-089:	Deg


		//SetUp04-090:	Rad


		//SetUp05-091:	Gra


		//SetUp06-092:	Fix

		//SetUp06Format03-093:	NumberOfDecimalPlaces


		//SetUp07-094:	Sci

		//SetUp07Format04-095:	MathO

		//SetUp07Format05-096:	LineO


		//SetUp08-097:	Norm

		//SetUp08Option01-098:	1~2


		//SetUp09-099:	ab/c


		//SetUp10-100:	d/c


		//SetUp11-101:	STAT

		//SetUp11Frequency01-102:	ON

		//SetUp12Frequency02-103:	OFF


		//SetUp12-104:	Rdec

		//SetUp12RecurDecimal01-105:	ON

		//SetUp12RecurDecimal02-106:	OFF


		//SetUp13-107:	Disp

		/SetUp13DecimalPoint01-108:	Dot

		//SetUp13DecimalPoint02-109:	Comma


		//SetUp14-110:	CONT

		//SetUp14Contrast01-111:	Light(LeftArrow)

		//SetUp14Contrats02-112:	Dark(RightArrow)



		//Class Variable Declarations

		//Integer Declarations
		int 	num1,
			num2;

		//String Declarations
		String	msg;



		//Class Initialisations

		//Integer Intialisations
		num1	= Integer.parseInt(args[0]);
		num2	= Integer.parseInt(args[2]);

		//String Initialisations
		msg	= args[0] + " " +
			args[1] + " " +
			args[2] + " = ";



		//Class Actions

		if(args.length != 3)
		{
			System.out.println("Wrong number of arguments");
			return;
		}

		if(args[1].equals("+"))		msg += (num1 + num2);
		else if(args[1].equals("-"))	msg += (num1 - num2);
		else if(args[1].equals("x"))	msg += (num1 * num2);
		else if(args[1].equals("/"))	msg += (num1 / num2);
		else if(args[1].equals("%"))	msg += (num1 % num2);
		else msg = "Incorrect Operator";

		System.out.println(msg);

	}
}
