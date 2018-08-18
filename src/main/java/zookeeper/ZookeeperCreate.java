package zookeeper;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;

public class ZookeeperCreate {

	private static ZooKeeper zk;
	static ZookeeperConnection zoo;
	
	public static void create(String path, byte[] data) throws KeeperException, InterruptedException {
		zk.create(path, data, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
	}

	public static void main(String args[]) throws Exception {
		zk=zoo.getConnect("127.0.0.1:2181");
		String path="/javaFirstDemo";
		byte[] data="first try".getBytes();
		create(path,data);
		zoo.close();
	}
}
