package p007c.p190n.p194b.p266d.p312i;

import android.os.IInterface;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.i.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2822b extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z, int i) throws RemoteException;

    int getIntFlagValue(String str, int i, int i2) throws RemoteException;

    long getLongFlagValue(String str, long j2, int i) throws RemoteException;

    String getStringFlagValue(String str, String str2, int i) throws RemoteException;

    void init(InterfaceC2799a interfaceC2799a) throws RemoteException;
}
