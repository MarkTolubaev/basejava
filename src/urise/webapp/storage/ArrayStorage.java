package urise.webapp.storage;

import urise.webapp.model.Resume;


public class ArrayStorage extends AbstractArrayStorage {

    @Override
    protected void doRemove(int index) {
        storage[index] = storage[size - 1];
    }

    @Override
    protected void doSave(int index, Resume resume) {
        storage[size - 1] = resume;
    }

    @Override
    protected Object findResume(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }
}
