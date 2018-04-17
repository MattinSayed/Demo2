package warehouseDB.exceptions;

public abstract class WarehouseException extends Throwable{

	String fehlermeldung;

	public WarehouseException(String fehler) {
		super();
		this.fehlermeldung = fehler;
	}

	@Override
	public String toString(){
		return this.fehlermeldung;
	}
}
