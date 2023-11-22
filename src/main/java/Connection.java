import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Connection {
    public static void connect(){
        String mongoUri = "mongodb://localhost:27017";
        MongoClient mongoClient = MongoClients.create(mongoUri);
        MongoDatabase database = mongoClient.getDatabase("projetNoSQL");
        MongoCollection<Document> collection = database.getCollection("Article");

        for (Document document : collection.find()) {
            System.out.println(document.toJson());
        }

        mongoClient.close();
    }
}
