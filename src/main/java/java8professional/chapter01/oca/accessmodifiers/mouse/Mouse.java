package java8professional.chapter01.oca.accessmodifiers.mouse;

import java8professional.chapter01.oca.accessmodifiers.cat.BigCat;

public class Mouse {

    {
        BigCat bigCat = new BigCat();
        //System.out.println(bigCat.id);      // private
        //System.out.println(bigCat.hasPaws); // package
        //System.out.println(bigCat.hasFur);  // protected
        System.out.println(bigCat.name);      // public
    }

}
