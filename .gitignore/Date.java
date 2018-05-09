public class Date{
	private int day;
	private int month;
	private int year;


 public Date(int d, int m, int y){
	if (y<1 || m<1 || m>12 || d<1) day = 1; month = 1; year = 2000;
	if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
		if (d>31) day=1;
	if (m == 4 || m == 6 || m == 9 || m == 11)
		if (d>30) day=1;
	if (m == 2 && y % 4 == 0) // bisestile
		if (d>29) day=1;
	if (m == 2 && y % 4 != 0) // non bisestile
		if (d>28) day=1;
	year = y;
	month = m;
	day = d;
}

  public Date() {
    day = 1; month = 1; year = 2000;}

 

  public int julianDay(Date d){
    int a, y, m;

   a=(14-d.getMonth())/12;
   y=d.getYear()+4800-a;
   m=d.getMonth()+12*a-3;
   return d.getDay() + (153*m+2)/5+365*y + y/4 - y/100 + y/400 - 32045;

 }

  public int getDay(){
    return day;}

  public int getMonth(){
    return month;}
  
  public int getYear(){
    return year;}


  public void setDate(int d,int m,int y){
    if (y<1 || m<1 || m>12 || d<1) return;
    if ( m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
    if (d>31) return;
    if (m==4 || m==6 || m==9 || m==11)
    if (d>30) return;
    if (m==2 && y%4==0)
      if (d>29) return;
    if (m==2 && y%4!=0)
      if (d>28) return;
    year = y;
    month = m;
    day = d;}


  public int diff(Date d){
    int my__jd,jd;

    my__jd=julianDay(this);
    jd=julianDay(d);

  return(jd - my__jd);}
}