package CreationalDesignPattern.FactoryMethod.Computer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Server  extends Computer{

	private String ram;
	
	private String hdd;
	
	private String cpu;
	
	
	
	@Override
	public String getRAM() {
		
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

}
