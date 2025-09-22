favorite_pet = "dog";

while True:
	pet = input("type a pet name like 'dog': ");
	if(pet == favorite_pet):
		print("Woof! dogs are awesome");
		break;
	else:
		print("cool choice, but i love dogs!");