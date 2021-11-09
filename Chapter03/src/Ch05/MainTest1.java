package Ch05;

public class MainTest1 {
	public static void main(String[] args) {
		
		Banana banana = new Banana();
		Peach peach = new Peach();
		
		banana.showInfo();
		peach.showInfo();
		
		/*
		ÀÚ¹Ù¿¡¼­ ´ÙÇü¼ºÀÌ¶õ?
		ºÎ¸ðÅ¸ÀÔ ÀÎ½ºÅÏ½º º¯¼ö¿¡ ÀÚ½Ä °´Ã¼¸¦ »ý¼ºÇÒ ¼ö ÀÖ´Ù.
		ex.  Friut fruit = new Banana(); 
		-> ºÎ¸ðÀÇ Å¸ÀÔÀ¸·Î ¾÷ Ä³½ºÆÃ µÈ »óÅÂ¶ó°í ÇÔ
		-> ºÎ¸ð ÀÚ½Ä °ü°è¿¡¼­ »ç¿ë°¡´ÉÇÏ´Ù.(»ó¼Ó±¸Á¶ÀÏ ¶§¸¸ °¡´É)
		-> ±× ¿ªÀº ¼º¸³ÇÏÁö ¾Ê´Â´Ù.
		-> Áï ÀÚ½Ä ÀÎ½ºÅÏ½º º¯¼ö¿¡(ÂüÁ¶º¯¼ö) ºÎ¸ð ÀÎ½ºÅÏ½º¸¦ »ý¼º½ÃÅ³ ¼ö ¾ø´Ù´Â ¶æ
		ex.  Banana banana = new Fruit(); -> ºÒ°¡
		
		ÇÏ³ªÀÇ ÄÚµå°¡ ¿©·Á ÀÚ·áÇüÀ¸·Î ±¸ÇöµÇ¾î ½ÇÇàµÇ´Â°Í
		¯‹Àº ÄÚµå¿¡¼­ ¿©·¯ ´Ù¸¥ ½ÇÇà °á°ú°¡ ³ª¿È
		Á¤º¸Àº´Ð, »ó¼Ó°ú ´õºÒ¾î °´Ã¼ÁöÇâ ÇÁ·Î±×·¡¹ÖÀÇ °¡Àå Å« Æ¯Â¡ Áß ÇÏ³ªÀÓ
		´ÙÇü¼ºÀ» Àß È°¿ëÇÏ¸é À¯¿¬ÇÏ°í È®Àå¼ºÀÌ ÀÖ°í, À¯Áöº¸¼ö°¡ Æí¸®ÇÑ ÇÁ·Î±×·¥À» ¸¸µé ¼ö ÀÖÀ½
		*/
		
		
	}// end of main
	
}// end of class
