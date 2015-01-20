// This is a SUGGESTED skeleton for a class that contains the Tables your
// program manipulates.  You can throw this away if you want, but it is a good
// idea to try to understand it first.  Our solution changes about 6
// lines in this skeleton.

// Comments that start with "//" are intended to be removed from your
// solutions.
package db61b;


import java.util.Collections;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Collection;
import java.util.ArrayList;

/** A collection of Tables, indexed by name.
 *  @author Alan Ponte
 */
class Database {
    /** An empty database. */
    public Database() {
        _tables = new Hashtable<String, Table>();
    }

    /** Return the Table whose name is NAME stored in this database, or null
     *  if there is no such table. */
    public Table get(String name) {
    		if ( hasTable(name) ) {
    			return null;
    		}
    		return _tables.get(name);
    }
    	
    /** Returns True iff NAME is the name of a 
     *  table in THIS Database. */
    public Boolean hasTable(String name) {
		ArrayList<String> tableNames = Collections.list(_tables.keys());
		for (int i = 0; i < tableNames.size(); i += 1) {
			if (tableNames.get(i).equals(name)) {
				return true;
			}
		}
		return false;
    }
    
    /** Set or replace the table named NAME in THIS to TABLE.  TABLE and
     *  NAME must not be null, and NAME must be a valid name for a table. */
    public void put(String name, Table table) {
        if (name == null || table == null) {
            throw new IllegalArgumentException("null argument");
        }
        _tables.put(name, table);
    }
    /** The collection of Tables in THIS Database.
     *  Each table will be identified by its name. */
    Hashtable<String, Table> _tables;
    
}