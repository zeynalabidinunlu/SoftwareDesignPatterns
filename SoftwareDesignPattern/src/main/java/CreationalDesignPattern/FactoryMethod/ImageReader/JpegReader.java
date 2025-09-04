package CreationalDesignPattern.FactoryMethod.ImageReader;

public class JpegReader implements ImageReader{

	private DecodedImage decodedImage;
	
	public JpegReader(String image) {
		decodedImage= new DecodedImage(image);
	}

	@Override
	public DecodedImage getDecodedImage() {
		return decodedImage;
	}
	
}
