package p636z0.p759s;

import androidx.lifecycle.ViewModel;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: z0.s.e0, reason: use source file name */
/* JADX INFO: compiled from: ViewModelStore.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewModelStore {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, ViewModel> f38702a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final void m16725a() {
        for (ViewModel viewModel : this.f38702a.values()) {
            viewModel.f794b = true;
            Map<String, Object> map = viewModel.f793a;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : viewModel.f793a.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            viewModel.mo438e();
        }
        this.f38702a.clear();
    }
}
