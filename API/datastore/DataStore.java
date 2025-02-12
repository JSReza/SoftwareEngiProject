package ClonedSoftwareEngiProject.SoftwareEngiProject.API.datastore;

public interface DataStore {
    DataStoreKey storeData(DataStoreRequest dataStoreRequest);

    DataLookupResult retrieveData(DataStoreKey key);

}
