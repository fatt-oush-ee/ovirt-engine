package org.ovirt.engine.core.common.asynctasks;

import org.ovirt.engine.core.compat.Guid;

public class AsyncTaskCreationInfo {

    private Guid privateTaskID = new Guid();
    private Guid privateStoragePoolID = new Guid();
    private AsyncTaskType privateTaskType = AsyncTaskType.forValue(0);

    public AsyncTaskCreationInfo() {
    }

    public AsyncTaskCreationInfo(Guid taskID, AsyncTaskType taskType, Guid storagePoolID) {
        setTaskID(taskID);
        setTaskType(taskType);
        setStoragePoolID(storagePoolID);
    }

    public Guid getTaskID() {
        return privateTaskID;
    }

    public void setTaskID(Guid value) {
        privateTaskID = value;
    }

    public AsyncTaskType getTaskType() {
        return privateTaskType;
    }

    public void setTaskType(AsyncTaskType value) {
        privateTaskType = value;
    }

    public Guid getStoragePoolID() {
        return privateStoragePoolID;
    }

    public void setStoragePoolID(Guid value) {
        privateStoragePoolID = value;
    }

}
