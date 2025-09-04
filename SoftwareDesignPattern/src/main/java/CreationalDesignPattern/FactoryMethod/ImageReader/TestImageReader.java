package CreationalDesignPattern.FactoryMethod.ImageReader;

public class TestImageReader {

    public static void main(String[] args) {

        DecodedImage decodedImage;
        ImageReader reader = null;

        String image1 = "gif";

        if (image1.equals("gif")) {
            reader = new GifReader(image1);
        } else if (image1.equals("jpeg")) {
            reader = new JpegReader(image1);
        } else {
            System.out.println("Desteklenmeyen format: " + image1);
            return; // ya da System.exit(0);
        }

        decodedImage = reader.getDecodedImage();
        System.out.println(decodedImage);
    }
}
