package baitaptuan1;

public abstract class Mobile {
    public void downloadApp() {

    };
}

 class IPhone extends Mobile {
   @Override
    public void downloadApp() {
        System.out.println("Download from Appstore");
    };

}

 class Nokia extends Mobile {
    @Override
    public void downloadApp() {
        System.out.println("Download from CHPlay");
    };

}

 class AndroidTest {
    public static void main(String[] args) {
        Nokia nokia = new Nokia();
       IPhone iPhone = new IPhone();

        nokia.downloadApp();
        iPhone.downloadApp();
    }
}