package server;

import server.db.ArvoreAVL;
import server.db.No;
import server.entities.Driver;
import server.entities.Vehicle;

public class Server {
    private ArvoreAVL db = new ArvoreAVL();

    public Server() {
        this.db.inserir(new Vehicle("EFG-3456", 34562345678L, "UrbanRunner", "06/08/2022", new Driver("Sophia Adams", "666.555.444-33")));
        this.db.inserir(new Vehicle("GHI-4567", 45673456789L, "Explorer X", "02/15/2023", new Driver("Ethan Davis", "777.666.555-44")));
        this.db.inserir(new Vehicle("IJK-5678", 56784567890L, "TrailBlazer Pro", "10/14/2022", new Driver("Ava White", "888.777.666-55")));
        this.db.inserir(new Vehicle("KLM-6789", 67895678901L, "TerraExplorer", "08/06/2021", new Driver("Noah Martinez", "999.888.777-66")));
        this.db.inserir(new Vehicle("MNO-7890", 78906789012L, "SpeedMaster X", "04/28/2023", new Driver("Oliver Lee", "000.999.888-77")));
        this.db.inserir(new Vehicle("OPQ-8901", 89017890123L, "CargoKing Deluxe", "01/20/2022", new Driver("Sophia Taylor", "111.000.999-88")));
        this.db.inserir(new Vehicle("QRS-9012", 90128901234L, "UrbanGlider", "09/10/2021", new Driver("William Johnson", "222.111.000-99")));
        this.db.inserir(new Vehicle("STU-0123", 12349012345L, "AdventureQuest", "07/20/2023", new Driver("Emma Martin", "333.222.111-00")));
        this.db.inserir(new Vehicle("TUV-1234", 23450123456L, "SkyRider", "05/22/2022", new Driver("Olivia Smith", "444.333.222-11")));
        this.db.inserir(new Vehicle("UVW-2345", 34561234567L, "WildTraveller", "03/08/2023", new Driver("Daniel Garcia", "555.444.333-22"))); 
        this.db.inserir(new Vehicle("XYZ-3456", 45672345678L, "CityCruiser", "11/15/2022", new Driver("Ella Martinez", "666.555.444-33")));
        this.db.inserir(new Vehicle("ABC-4567", 56783456789L, "UrbanChallenger", "09/28/2023", new Driver("James Johnson", "777.666.555-44")));
        this.db.inserir(new Vehicle("DEF-5678", 67894567890L, "AdventureMaster X", "06/12/2022", new Driver("Sophia Adams", "888.777.666-55")));
        this.db.inserir(new Vehicle("GHI-6789", 78905678901L, "TrailSeeker", "04/09/2021", new Driver("Ethan Davis", "999.888.777-66")));
        this.db.inserir(new Vehicle("JKL-7890", 89016789012L, "TerraGlider", "01/01/2023", new Driver("Ava White", "000.999.888-77")));
        this.db.inserir(new Vehicle("MNO-8901", 90127890123L, "SpeedRover X", "09/20/2022", new Driver("Noah Martinez", "111.000.999-88")));
        this.db.inserir(new Vehicle("PQR-9012", 12348901234L, "CargoChampion", "07/05/2023", new Driver("Oliver Lee", "222.111.000-99")));
        this.db.inserir(new Vehicle("STU-9012", 23459012345L, "SkyMaster", "05/12/2022", new Driver("Sophia Taylor", "333.222.111-00")));
        this.db.inserir(new Vehicle("VWX-3456", 34560123456L, "UrbanTraveller X", "03/28/2023", new Driver("William Johnson", "444.333.222-11")));
        this.db.inserir(new Vehicle("YZA-4567", 45671234567L, "AdventureQuest Pro", "12/02/2021", new Driver("Emma Martin", "555.444.333-22"))); 
        this.db.inserir(new Vehicle("BCD-5678", 56782345678L, "SkyRacer", "08/10/2022", new Driver("Liam Anderson", "666.555.444-33")));
        this.db.inserir(new Vehicle("EFG-6789", 67893456789L, "UrbanGlider Pro", "04/18/2023", new Driver("Olivia Johnson", "777.666.555-44")));
        this.db.inserir(new Vehicle("HIJ-7890", 78904567890L, "AdventureXplorer", "02/27/2022", new Driver("Sophia Brown", "888.777.666-55")));
        this.db.inserir(new Vehicle("JKL-8901", 89015678901L, "TrailMaster", "12/06/2021", new Driver("Noah Garcia", "999.888.777-66")));
        this.db.inserir(new Vehicle("MNO-9012", 90126789012L, "TerraRider X", "10/28/2022", new Driver("Ethan Martinez", "000.999.888-77")));
        this.db.inserir(new Vehicle("PQR-0123", 12337890123L, "SpeedChampion", "06/15/2023", new Driver("Ava Smith", "111.000.999-88")));
        this.db.inserir(new Vehicle("STU-1234", 23448901234L, "CargoMaster Deluxe", "03/01/2022", new Driver("Oliver Taylor", "222.111.000-99")));
        this.db.inserir(new Vehicle("UVW-2345", 34559012345L, "UrbanVoyager", "01/25/2023", new Driver("Emma Davis", "333.222.111-00")));
        this.db.inserir(new Vehicle("XYZ-3456", 45660123456L, "Explorer Pro", "09/08/2022", new Driver("William Johnson", "444.333.222-11")));
        this.db.inserir(new Vehicle("ABC-4567", 56771234567L, "SkyQuest", "07/13/2023", new Driver("Ella Martin", "555.444.333-22"))); 
        this.db.inserir(new Vehicle("DEF-6789", 67894567890L, "WildRider", "04/05/2022", new Driver("Liam Adams", "666.555.444-33")));
        this.db.inserir(new Vehicle("GHI-7890", 78905678901L, "CityChampion", "01/18/2023", new Driver("Olivia Johnson", "777.666.555-44")));
        this.db.inserir(new Vehicle("JKL-8901", 89016789012L, "TrailMaster X", "11/27/2022", new Driver("James Davis", "888.777.666-55")));
        this.db.inserir(new Vehicle("MNO-9012", 90127890123L, "UrbanTraveller", "09/09/2021", new Driver("Sophia Brown", "999.888.777-66")));
        this.db.inserir(new Vehicle("PQR-0123", 12338901234L, "AdventureQuest X", "07/01/2023", new Driver("Ethan Martinez", "000.999.888-77")));
        this.db.inserir(new Vehicle("STU-1234", 23449012345L, "SkyMaster Pro", "05/15/2022", new Driver("Ava White", "111.000.999-88")));
        this.db.inserir(new Vehicle("UVW-2345", 34550123456L, "Explorer Deluxe", "03/28/2023", new Driver("Noah Garcia", "222.111.000-99")));
        this.db.inserir(new Vehicle("XYZ-3456", 45661234567L, "TerraChallenger", "12/12/2022", new Driver("Oliver Lee", "333.222.111-00")));
        this.db.inserir(new Vehicle("ABC-4567", 56772345678L, "SpeedXplorer", "10/25/2021", new Driver("Emma Martin", "444.333.222-11")));
        this.db.inserir(new Vehicle("DEF-5678", 67883456789L, "CargoGlider Pro", "08/28/2022", new Driver("William Johnson", "555.444.333-22"))); 
        this.db.inserir(new Vehicle("GHI-6789", 78994567890L, "UrbanAdventurer", "04/30/2022", new Driver("Sophia Adams", "666.555.444-33")));
        this.db.inserir(new Vehicle("JKL-7890", 89005678901L, "TrailRover", "02/05/2023", new Driver("Ethan Davis", "777.666.555-44")));
        this.db.inserir(new Vehicle("MNO-8901", 90116789012L, "SkyChallenger X", "12/20/2022", new Driver("Ava White", "888.777.666-55")));
        this.db.inserir(new Vehicle("PQR-9012", 12327890123L, "WildMaster", "10/14/2021", new Driver("Noah Martinez", "999.888.777-66")));
        this.db.inserir(new Vehicle("STU-0123", 23438901234L, "CityTraveller", "08/06/2023", new Driver("Oliver Lee", "000.999.888-77")));
        this.db.inserir(new Vehicle("TUV-1234", 34549012345L, "AdventureRider X", "05/18/2022", new Driver("Sophia Taylor", "111.000.999-88")));
        this.db.inserir(new Vehicle("UVW-2345", 45650123456L, "TerraChampion", "03/30/2023", new Driver("William Johnson", "222.111.000-99")));
        this.db.inserir(new Vehicle("XYZ-3456", 56761234567L, "SpeedXplorer Pro", "01/13/2022", new Driver("Emma Martin", "333.222.111-00")));
        this.db.inserir(new Vehicle("ABC-4567", 67872345678L, "CargoTraveller Deluxe", "09/26/2022", new Driver("Olivia Smith", "444.333.222-11")));
        this.db.inserir(new Vehicle("DEF-5678", 78983456789L, "UrbanGlider", "07/08/2023", new Driver("Daniel Garcia", "555.444.333-22")));  
        this.db.inserir(new Vehicle("GHI-7890", 90194567890L, "CityChampion X", "04/05/2022", new Driver("Sophia Adams", "666.555.444-33")));
        this.db.inserir(new Vehicle("JKL-8901", 12305678901L, "TrailRider", "01/15/2023", new Driver("Ethan Davis", "777.666.555-44")));
        this.db.inserir(new Vehicle("MNO-9012", 23416789012L, "SkyExplorer", "11/14/2022", new Driver("Ava White", "888.777.666-55")));
        this.db.inserir(new Vehicle("PQR-0123", 34527890123L, "WildChallenger Pro", "09/06/2021", new Driver("Noah Martinez", "999.888.777-66")));
        this.db.inserir(new Vehicle("STU-1234", 45638901234L, "CityGlider", "07/28/2023", new Driver("Oliver Lee", "000.999.888-77")));
        this.db.inserir(new Vehicle("TUV-2345", 56749012345L, "AdventureMaster X", "05/22/2022", new Driver("Sophia Taylor", "111.000.999-88")));
        this.db.inserir(new Vehicle("UVW-3456", 67860123456L, "TerraQuest", "03/08/2023", new Driver("William Johnson", "222.111.000-99")));
        this.db.inserir(new Vehicle("XYZ-4567", 78971234567L, "SpeedRider Pro", "01/20/2022", new Driver("Emma Martin", "333.222.111-00")));
        this.db.inserir(new Vehicle("ABC-5678", 89082345678L, "CargoTraveller", "11/15/2022", new Driver("Olivia Smith", "444.333.222-11")));
        this.db.inserir(new Vehicle("DEF-6789", 90193456789L, "UrbanAdventurer X", "09/08/2023", new Driver("Daniel Garcia", "555.444.333-22")));
    }

    public void save(Vehicle vehicle) {
        this.db.inserir(vehicle);
    }

    public void remove(long renavam) {
        this.db.remove(renavam);
    }

    public void getAll() {
        this.db.ordem();
    }

    public int getAllNodes() {
        return this.db.contarNos();
    }

    public No getOne(long renavam) {
        return this.db.search(renavam);
    }

    public boolean update(long renavam, Vehicle v) {
        var vehicle = new Vehicle();
        var no = this.getOne(renavam);
        if (no == null) return false;
        vehicle.setRenavam(no.getValor().getRenavam());
        vehicle.setLicencePlate(v.getLicencePlate());
        vehicle.setName(v.getName());
        vehicle.setManufacturingDate(v.getManufacturingDate());
        vehicle.setDriver(v.getDriver());
        this.remove(renavam);
        this.save(vehicle);
        return true;
    } 
}
