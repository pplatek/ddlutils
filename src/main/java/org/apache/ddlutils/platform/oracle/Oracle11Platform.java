package org.apache.ddlutils.platform.oracle;

public class Oracle11Platform extends Oracle10Platform {
    /** Database name of this platform. */
    public static final String DATABASENAME              = "Oracle11";
    /** The standard Oracle jdbc driver. */
    public static final String JDBC_DRIVER               = "oracle.jdbc.OracleDriver";
    /** The thin subprotocol used by the standard Oracle driver. */
    public static final String JDBC_SUBPROTOCOL_THIN     = "oracle:thin";
    
    public Oracle11Platform()
    {
        super();
    }
}
