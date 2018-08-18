package zookeeper;

import java.util.concurrent.CountDownLatch;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.apache.zookeeper.ZooKeeper;

public class ZookeeperConnection {
	public  final CountDownLatch connectedSignal = new CountDownLatch(1);
	ZooKeeper zoo;
	public  ZooKeeper getConnect(String host) throws Exception {
		zoo = new ZooKeeper(host,5000,new Watcher() {
			public void process(WatchedEvent we) {
				 if (we.getState() == KeeperState.SyncConnected) {
		               connectedSignal.countDown();
		            }
			}
	      });
			
	      connectedSignal.await();
	      return zoo;
	      }
	public void close() throws Exception {
		zoo.close();
	}
	}
