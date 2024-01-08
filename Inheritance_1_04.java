package chap15;

class box{
    public void simplewrap()
    {
        System.out.println("simple wrapping");
    }
}

class paperbox extends box{
    public void paperwrap()
    {
        System.out.println("paper wrapping");
    }
}

class goldpaperbox extends paperbox{
    public void goldwrap()
    {
        System.out.println("gold wrapping");
    }
}

public class Inheritance_1_04 {
    public static void main(String[] args) {
        box box1 = new box();
        paperbox box2 = new paperbox();
        goldpaperbox box3 = new goldpaperbox();

        wrapbox(box1);
        wrapbox(box2);
        wrapbox(box3);
    }

    public static void wrapbox(box box){
        if (box instanceof goldpaperbox)
        {
            ((goldpaperbox)box).goldwrap();
        }
        else if(box instanceof paperbox)
        {
            ((paperbox)box).paperwrap();
        }
        else{
            box.simplewrap();
        }
    }
}
