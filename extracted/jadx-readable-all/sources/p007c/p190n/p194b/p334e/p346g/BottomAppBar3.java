package p007c.p190n.p194b.p334e.p346g;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: c.n.b.e.g.b, reason: use source file name */
/* JADX INFO: compiled from: BottomAppBar.java */
/* JADX INFO: loaded from: classes.dex */
public class BottomAppBar3 extends FloatingActionButton.AbstractC5957a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24984a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BottomAppBar f24985b;

    /* JADX INFO: renamed from: c.n.b.e.g.b$a */
    /* JADX INFO: compiled from: BottomAppBar.java */
    public class a extends FloatingActionButton.AbstractC5957a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC5957a
        /* JADX INFO: renamed from: b */
        public void mo11109b(FloatingActionButton floatingActionButton) {
            BottomAppBar.m12716w(BottomAppBar3.this.f24985b);
        }
    }

    public BottomAppBar3(BottomAppBar bottomAppBar, int i) {
        this.f24985b = bottomAppBar;
        this.f24984a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC5957a
    /* JADX INFO: renamed from: a */
    public void mo11108a(FloatingActionButton floatingActionButton) {
        BottomAppBar bottomAppBar = this.f24985b;
        int i = this.f24984a;
        int i2 = BottomAppBar.f28780U;
        floatingActionButton.setTranslationX(bottomAppBar.m12723F(i));
        floatingActionButton.m12810o(new a(), true);
    }
}
