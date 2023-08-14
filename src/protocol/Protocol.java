package protocol;

import java.util.ArrayList;

import server.Server;
import server.db.No;
import server.entities.Vehicle;

public class Protocol {
    private Server server = new Server();

    private int responseINT = -1;
    private No responseNo = null;
    private Boolean responseBool = false;

    public void request(int type, Vehicle data) {
        switch (type) {
            case 0: 
                // inserir
                this.server.save(data);
                break;
            case 1:
                this.server.remove(data.getRenavam());
                break;
            case 2: 
                this.server.getAll();
                break;
            case 3: 
                this.server.remove(data.getRenavam());
                break;
            case 4:
                responseNo = this.server.getAllByLicensePlate(data.getLicencePlate());
                break;
            case 6: 
                responseINT = this.server.getAllNodes();
                break;
            case 7: 
                responseBool = this.server.update(data.getRenavam(), data);
                break;
            case 8: 
                responseNo = this.server.getOne(data.getRenavam());
                break;

        }
    }

    public int response() {
        return this.responseINT;
    }
    
    public No responseNo() {
        return this.responseNo;
    }

    public Boolean responseBool() {
        return this.responseBool;
    }

}
