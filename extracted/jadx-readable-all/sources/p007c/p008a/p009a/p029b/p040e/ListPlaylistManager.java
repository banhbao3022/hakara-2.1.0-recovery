package p007c.p008a.p009a.p029b.p040e;

import android.app.Application;
import android.app.Service;
import java.util.List;
import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.b.e.b, reason: use source file name */
/* JADX INFO: compiled from: ListPlaylistManager.kt */
/* JADX INFO: loaded from: classes.dex */
public class ListPlaylistManager<I extends PlaylistItem> extends BasePlaylistManager<I> {

    /* JADX INFO: renamed from: v */
    public List<? extends I> f1786v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListPlaylistManager(Application application, Class<? extends Service> cls) {
        super(application, cls);
        Intrinsics2.m13090f(application, "application");
        Intrinsics2.m13090f(cls, "mediaServiceClass");
    }

    @Override // p007c.p008a.p009a.p029b.p040e.BasePlaylistManager
    /* JADX INFO: renamed from: d */
    public I mo1275d(int i) {
        List<? extends I> list;
        if (i >= mo1276e() || (list = this.f1786v) == null) {
            return null;
        }
        return list.get(i);
    }

    @Override // p007c.p008a.p009a.p029b.p040e.BasePlaylistManager
    /* JADX INFO: renamed from: e */
    public int mo1276e() {
        List<? extends I> list = this.f1786v;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
