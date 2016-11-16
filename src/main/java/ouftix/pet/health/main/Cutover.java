package ouftix.pet.health.main;

import java.time.LocalDate;
import java.time.Month;

import ouftix.pet.health.model.Address;
import ouftix.pet.health.model.Email;
import ouftix.pet.health.model.People;
import ouftix.pet.health.model.Pet;
import ouftix.pet.health.model.Phone;

/**
 * Created by zt974 on 15-Nov-16.
 */
public class Cutover {

    public static void main(String[] args) {
	People muriel = People.builder()
		.firstName("Muriel")
		.lastName("Laurent")
		.profession("Docteur vétérinaire")
		.address(
			Address.builder()
				.addressType(Address.AddressType.PROFESSIONAL)
				.street("Rue Georges Bodard")
				.number("41")
				.postalCode("6750")
				.city("Musson")
				.country("Belgique")
				.build())
		.phone(
			Phone.builder()
				.phoneType(Phone.PhoneType.FIX)
				.personal(false)
				.countryCode("32")
				.phoneNumber("63 67 89 10")
				.build())
		.phone(
			Phone.builder()
				.phoneType(Phone.PhoneType.MOBILE)
				.personal(false)
				.countryCode("32")
				.phoneNumber("465 21 17 79")
				.build())
		.email(
			Email.builder()
				.emailType(Email.EmailType.PROFESSIONAL)
				.address("muriellaurentvt@yahoo.fr")
				.build())
		.build();
	People luc = People.builder()
		.firstName("Luc")
		.lastName("Mangin")
		.profession("Aliments pour chiens et chats.")
		.address(
			Address.builder()
				.addressType(Address.AddressType.PROFESSIONAL)
				.street("Rue René Nicolas")
				.number("71")
				.postalCode("6750")
				.city("Musson")
				.country("Belgique")
				.build())
		.phone(
			Phone.builder()
				.phoneType(Phone.PhoneType.MOBILE)
				.personal(false)
				.countryCode("32")
				.phoneNumber("471 58 55 18")
				.build())
		.email(
			Email.builder()
				.emailType(Email.EmailType.PROFESSIONAL)
				.address("luc.husse@gmail.com")
				.build())
		.build();
	People stephane = People.builder()
		.firstName("Stéphane")
		.lastName("Stiennon")
		.address(
			Address.builder()
				.addressType(Address.AddressType.PROFESSIONAL)
				.street("Rue Reifenberg")
				.number("3")
				.postalCode("6792")
				.city("Aix-sur-Cloie")
				.country("Belgique")
				.build())
		.phone(
			Phone.builder()
				.phoneType(Phone.PhoneType.MOBILE)
				.personal(true)
				.countryCode("32")
				.phoneNumber("476 36 74 18")
				.build())
		.phone(
			Phone.builder()
				.phoneType(Phone.PhoneType.MOBILE)
				.personal(false)
				.countryCode("352")
				.phoneNumber("621 294 726")
				.build())
		.phone(
			Phone.builder()
				.phoneType(Phone.PhoneType.FIX)
				.personal(true)
				.countryCode("32")
				.phoneNumber("63 60 23 92")
				.build())
		.email(
			Email.builder()
				.emailType(Email.EmailType.PROFESSIONAL)
				.address("stephane.stiennon@clearstream.com")
				.build())
		.email(
			Email.builder()
				.emailType(Email.EmailType.PERSONAL)
				.address("stephane.stiennon@gmail.com")
				.build())
		.build();

	Pet edgar = Pet.builder().id("1").name("Edgar").petType(Pet.PetType.DOG)
		.birthDay(LocalDate.of(2004, Month.DECEMBER, 27)).deathDay(LocalDate.of(2016, Month.SEPTEMBER, 4))
		.build();
	Pet hyuma = Pet.builder().id("2").name("Hyuma").petType(Pet.PetType.DOG)
		.birthDay(LocalDate.of(2008, Month.DECEMBER, 8)).build();
	Pet canelle = Pet.builder().id("3").name("Canelle").petType(Pet.PetType.CAT)
		.birthDay(LocalDate.of(2011, Month.MAY, 5)).build();
	Pet muse = Pet.builder().id("4").name("Muse").officialName("Alba'Eyes Muse").petType(Pet.PetType.DOG)
		.birthDay(LocalDate.of(2013, Month.MAY, 7)).build();

	System.out.println("Muriel   " + muriel);
	System.out.println("Luc      " + luc);
	System.out.println("Stéphane " + stephane);

	System.out.println("Edgar    " + edgar);
	System.out.println("Hyuma    " + hyuma);
	System.out.println("Canelle  " + canelle);
	System.out.println("Muse     " + muse);
    }
}
