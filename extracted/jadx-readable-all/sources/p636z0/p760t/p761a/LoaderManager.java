package p636z0.p760t.p761a;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: z0.t.a.a, reason: use source file name */
/* JADX INFO: compiled from: LoaderManager.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class LoaderManager {

    /* JADX INFO: renamed from: z0.t.a.a$a */
    /* JADX INFO: compiled from: LoaderManager.java */
    public interface a<D> {
    }

    /* JADX INFO: renamed from: b */
    public static <T extends LifecycleOwner & ViewModelStoreOwner> LoaderManager m16748b(T t) {
        return new LoaderManagerImpl(t, t.mo128o());
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public abstract void mo16749a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
