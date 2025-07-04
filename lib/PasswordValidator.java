package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * ตรวจสอบรหัสผ่านที่มีตัวเลขและตัวอักษรจำนวน 8 ตัวว่าใช้งานไม่ได้ ง่าย ปานกลาง หรือยาก
     * @param รับค่า String ทั้งหมดจำนวน 8 ตัว โดยไม่เป็น null หรือempty
     * @return แสดงผลลัพธ์ค่าที่ได้แล้วค่าจะกลับไปที่ INVALD WEAK MEDIUM STRONG
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        if(password==null || password.length()<8)
           return PasswordStrength.INVALID;
          
        boolean haslower = false;
        boolean hasUpper = false;
        boolean Number = false;

    
        for (char c: password.toCharArray()) {
            if(Character.isLowerCase(c))
               haslower = true;
            else if(Character.isUpperCase(c))
               hasUpper = true;
            else if(Character.isDigit(c))
               Number = true; 

        }if(haslower && hasUpper && Number)
           return PasswordStrength.STRONG;
        else if(haslower && !hasUpper) 
           return PasswordStrength.WEAK;
        else if(haslower && hasUpper) 
           return PasswordStrength.MEDIUM;
        else return PasswordStrength.WEAK;
    }
}