import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;


import java.io.IOException;
import java.util.Set;

public class HBaseClientDemo {

    private static Connection conn = null;
    private static Configuration conf = null;

    public static void main(String[] args) throws IOException {
        TableName tableName = TableName.valueOf("dev_cif:filepattern");

        conf = HBaseConfiguration.create();
        conf.set("hbase.zookeeper.quorum", "mclmp01vr.bcbsma.com,mclmp02vr.bcbsma.com,mclmp03vr.bcbsma.com");
        conf.set("hbase.zookeeper.property.clientPort", "2181");
        conn = ConnectionFactory.createConnection(conf);

/*        Admin admin = conn.getAdmin();
        if (!admin.tableExists(tableName)) {
            admin.createTable(new HTableDescriptor(tableName).addFamily(new HColumnDescriptor("cf")));
        }*/

        Table table = conn.getTable(tableName);
        Scan scan = new Scan();
        ResultScanner scanner1 = table.getScanner(scan);

        for (Result scn : scanner1) {
            System.out.println("Hbase table scan-->" + scn);
            System.out.println("Key **>" + table.get(new Get(Bytes.toBytes("mo_.*_(fx|di)_.*_cddm.csv.*"))));


/*        Put p = new Put(Bytes.toBytes("AAPL10232015"));
        p.addColumn(Bytes.toBytes("cf"), Bytes.toBytes("close"), Bytes.toBytes(119));
        table.put(p);

        Result r = table.get(new Get(Bytes.toBytes("AAPL10232015")));
        System.out.println(r);*/
        }
    }
}
