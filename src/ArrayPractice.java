import java.util.Scanner;

public class ArrayPractice {
	public static void main(String[] args) {
		
	}

	public static char getChar(){
		Scanner s = new Scanner(System.in);
		return s.next().charAt(0);
	}
	public static int getInput(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	public static void exampleArray (){
		System.out.println("Enter a numbers for avg: ");
		int[] arr = new int[3] ;
		arr[0] = 4;
		arr [1] = 7;
		arr [2] = 3;

		int sum = 0;
		for (int i = 0; i <= arr.length-1; i++) {
			sum += arr[i];
		}
		int avg = sum / arr.length;
		System.out.println(avg);
		//מדפיסה ממוצע של מערך על ידי קליטת ערכים ידנית
	}
	public static void averageArray(){
		int[] arr = new int[5];
		int sum =0;
		System.out.printf("Enter a %d numbers: ", arr.length);
		for (int i = 0; i < arr.length ; i++) {
			arr[i] = getInput();
			sum += arr[i];
		}
		int avg = sum / arr.length;
		System.out.println("The avg is: " + avg );
		//מדפיסה ממוצע של מערך על ידי קליטת ערכים מהמשתמש
	}
	public static void reversNumberArray(){
		int[] arr = new int[5];
		System.out.println("Enter a " + arr.length + " numbers: ");
		for (int i = 0; i < arr.length ; i++) {
			arr [i] = getInput();
		}
		System.out.print("The number are: " );
		for (int i = arr.length-1;  i >= 0 ; i--) {
			System.out.println(arr[i]);
			//מדפיסה את איברי המערך הפוך
		}
	}
	public static void findMaxValueArray(){
		System.out.println("How many numbers you want to check for max?");
		int size = getInput();
		System.out.println("Enter " + size + " numbers:");
		int [] arr = createArray(size);
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println("The max is at index |" + maxIndex + "| and its value is: " + arr[maxIndex] );
		//  בדיקת מספר מקסימלי והאינדקס שמכיל אותו על ידי זימון פונקציה חיצונית של קליטת מערכים
	}
	public static int[] createArray(int size){
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr [i] = getInput();
		}
		return arr;
	}
	public static void histogramArrayValues(){
		int []arr ={4,3,2,7};
		System.out.println("There are " + arr.length + " number in the array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ":");
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	public static void palindromeArray() {
		int[] arr = new int[5];
		int left, right;
		boolean isSymetric = true;
		System.out.println("Enter " + arr.length + " numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getInput();
		}
		for (left = 0, right = arr.length - 1; left < right && isSymetric; left++, right--) {
			if (arr[left] != arr[right]) {
				isSymetric = false;
			}
		}
		if (isSymetric) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is NOT palindrome");
		}
	}
	public static void favoriteDayArray(){
		final int EXIT = -1;
		int[] dayFrequency = new int[7];
		int day, maxDayIndex=0;
		do {
			System.out.println("What your favorite day in the week <1-7> ,+ " + EXIT + "to EXIT:");
			day = getInput();
			if (day!= EXIT){
				dayFrequency[day-1] ++;
			}
		}while (day != EXIT);
		System.out.println("Each day and number of persons who liked it most: ");
		for (int i = 1; i <= dayFrequency.length; i++) {
			System.out.println( i + ": " + dayFrequency[i-1]);
		}
		for (int i = 1; i < dayFrequency.length; i++) {
			if (dayFrequency[i] > dayFrequency[maxDayIndex]){
				maxDayIndex = i;
			}
		}
		System.out.println("The favorite day is: " +(maxDayIndex +1) );
	}
	public static void appearsMostTimesArray(){
		int num;
		int [] counters = new int[10];

		System.out.println("Enter a number: ");
		num =getInput();

		while(num>0){
			counters[num%10]++;
			num /=10;
		}
		int maxIndex =0;
		for (int i = 1; i < counters.length ; i++) {
			if (counters[i] > counters[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println("The digit that appears most is |" + maxIndex + "| She appeared: " + counters[maxIndex] +  " times");
	}
	public static void valuesIntoNewArray(){
		int[] arr = {1,2,3};
		int[] arr2 = new int[3];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i];
			System.out.print(arr2[i]);
		}

		//השמת ערכי מערכים למערך חדש
	}
	public static void checkEven(){
		int[] arr = new int[10];
		System.out.println("Enter " + arr.length + " numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getInput();
		}
		System.out.print("All Even values: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] %2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		//מדפיס רק איברים זוגיים
	}
	public static void checkCapitalLetter(){
		char[] letters = new char[10];
		System.out.println("Enter " + letters.length + " characters:");
		for (int i = 0; i < letters.length; i++) {
			letters[i]= getChar();
		}
		System.out.print("Indexes of capital letters:  ");
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] >='A' && letters[i] <= 'Z'){
				System.out.print(i + ",");
			}
			//מדפיס באיזה איבר במערך האות שנקלטה היא גדולה
		}
		System.out.println();
	}
	public static void multiples3array(){
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i*3;
		}
		System.out.print("All values: ");
		for (int n : numbers){
			System.out.print(n + " ");
		}
		System.out.println();
		//מציג כפולות של 3 במערך
	}
	public static void plus1ForEvenPlace(){
		int[] arr = new int[5];
		System.out.println("Enter " + arr.length+  " numbers:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getInput();
		}
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0 ){
				arr [i] += 1;
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// מגדיל ב1 את הערכים שנמצאים במיקומים זוגיים (0,2,4 וכו)
	}
	public static void plusForEvenMinusToMultipleOf3(){
		int[] arr1 = new int[10];
		System.out.println("Enter " + arr1.length +  " numbers:");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = getInput();
		}
		for (int i = 0; i < arr1.length; i++) {
			if (i % 2 == 0 ){
				arr1 [i] += 1;
			}
			if (i%3 == 0){
				arr1 [i] -=1;
			}
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		//מגדיל ב1 את כל הערכים שנמצאים במקומות הזוגיים
		// וגם מקטין ב1 את הערכים שנמצאים במקומות שהם כפולה של 3
	}
	public static void additionalCharacterAppears(){
		int size, count = 0;

		System.out.print("How many characters would you like to enter? ");
		size =getInput();
		char[] letters = new char[size];

		System.out.println("Enter " + letters.length + " characters: ");
		for (int i = 0; i < letters.length; i++) {
			letters[i] = getChar();
		}

		System.out.print("Enter another character: ");
		char ch = getChar();
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == ch){
				count++;
			}
		}
		//System.out.printf("The char|%c| appears %d times \n", ch, count);
		System.out.print("The extra character |" + ch + "| appears " + count+ " times");
		//קולטים מערך של 10 תווים ואז תו נוסף ובודקים כמה פעמים התו הנוסף מופיע במערך
	}
	public static void checksIdenticalLocations(){
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];

		System.out.println("Enter " + arr1.length + " numbers to first array: ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = getInput();
		}
		System.out.println("Enter " + arr2.length + " numbers to second array: ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = getInput();
		}
		System.out.print("The locations are the same in 2 arrays: ");
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]){
				System.out.print(i + " ");
			}
		}
		//מציג את המיקומים אשר הערכים בהם ב2 המערכים זהים
	}
	public static void sumOf2Arrays(){
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		int[] arr3 = new int[5];

		System.out.println("Enter " + arr1.length + " numbers to first array: ");
		for (int i = 0; i < arr1.length; i++){
			arr1[i] = getInput();
		}
		System.out.println("Enter " + arr2.length + " numbers to second array: ");
		for (int i = 0; i < arr2.length; i++){
			arr2[i] = getInput();
		}
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr2[i] + arr1[i];
			System.out.println("The sum of 2 arrays in the "+ i + " position is: " + arr3[i]);
		}
		//סוכם את המערכים 1 ו2 ושם אותם במערך 3 לפי הסדר
	}
	public static void checkLettersSame(){
		char[] letters = new char[5];
		boolean allSame = true;
		System.out.println("Enter " + letters.length + " characters: ");
		for (int i = 0; i < letters.length; i++) {
			letters[i] = getChar();
		}
		for (int i = 0; i < letters.length; i++) {
			for (int j = 1; j < letters.length; j++) {
				if (letters[i] != letters[j]) {
					allSame = false;
					break;
				}
			}
		}if (allSame){
			System.out.println("All letters are the same :)");
		}else {
			System.out.println("The letters are NOT the same :(");
		}
		//בודק האם כל התווים שהוקלדו במערך זהים
	}
	public static void checkOrderArray(){
		int size;
		System.out.print("How many numbers in the array? ");
		size = getInput();
		int[] arr = new int[size];
		boolean temp = true;
		System.out.println("Enter " + arr.length + " numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getInput();
		}
		for (int i = 1; i < arr.length ; i++) {
			if (arr[i -1] > arr[i]){
				temp = false;
				break;
			}
		}if (temp){
			System.out.println("The all number are in order :)");
		}else {
			System.out.println("NOT all number are in order :(");
		}
	}
}
