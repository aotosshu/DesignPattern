package abstractfactory;

import abstractfactory.model.Computer;
import abstractfactory.model.PC;
import abstractfactory.model.Server;

public interface ComputerAbstractFactory {

    Computer createComputer();
}
