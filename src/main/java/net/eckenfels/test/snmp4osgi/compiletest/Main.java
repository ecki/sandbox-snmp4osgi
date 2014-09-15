package net.eckenfels.test.snmp4osgi.compiletest;

import org.snmp4j.CommandResponderEvent;
import org.snmp4j.PDU;

/**
 * Hello world!
 */
public class Main {
    static CommandResponderEvent evt = null;

    public static void main(String[] args) {
        PDU pdu = evt.getPDU();
    }
}
