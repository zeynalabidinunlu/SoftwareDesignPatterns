package CreationalDesignPattern.FactoryMethod.ImageReader;

public class DecodedImage {
    private final String imageFile;

    public DecodedImage(String imageFile) {
        this.imageFile = imageFile;
    }

    public String getImageFile() {
        return imageFile;
    }

    @Override
    public String toString() {
        return "DecodedImage: " + imageFile;
    }
}
