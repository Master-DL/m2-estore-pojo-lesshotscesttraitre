package core.services;

import estorePojo.exceptions.UnknownItemException;

public interface IStoreGet {

    double getPrice(Object item) throws UnknownItemException;

    boolean isAvailable(Object item, int qty) throws UnknownItemException;

}
