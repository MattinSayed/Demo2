package warehouseDB.exceptions;

public class CommodityDoesNotExistException extends WarehouseException{

	public CommodityDoesNotExistException(String fehler) {
		super(fehler);
	}

}
