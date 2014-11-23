package converter;

import model.AddressDetail;

import org.dozer.DozerConverter;

import dto.Location;

public class AddressConverter extends DozerConverter<AddressDetail, Location> {

	public AddressConverter() {
		super(AddressDetail.class, Location.class);
	}

	@Override
	public AddressDetail convertFrom(Location location,
			AddressDetail addressDetail) {
		if (addressDetail == null) {
			addressDetail = new AddressDetail();
		}
		addressDetail.setNumber(location.getNo());
		addressDetail.setStreet(location.getName());
		addressDetail.setPin(location.getPin());
		return addressDetail;
	}

	@Override
	public Location convertTo(AddressDetail addressDetail, Location location) {
		if (location == null) {
			location = new Location();
		}
		location.setName(addressDetail.getStreet());
		location.setNo(addressDetail.getNumber());
		location.setPin(addressDetail.getPin());
		return location;
	}

}
