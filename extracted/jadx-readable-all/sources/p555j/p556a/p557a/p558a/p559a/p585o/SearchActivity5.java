package p555j.p556a.p557a.p558a.p559a.p585o;

import com.google.android.material.tabs.TabLayout;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.search.SearchActivity;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.p336b0.TabLayoutMediator;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.o.d, reason: use source file name */
/* JADX INFO: compiled from: SearchActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SearchActivity5 implements TabLayoutMediator.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchActivity f31702a;

    public SearchActivity5(SearchActivity searchActivity) {
        this.f31702a = searchActivity;
    }

    @Override // p007c.p190n.p194b.p334e.p336b0.TabLayoutMediator.b
    /* JADX INFO: renamed from: a */
    public final void mo11026a(TabLayout.C5969g c5969g, int i) {
        String string;
        Intrinsics2.m13089e(c5969g, "tab");
        SearchActivity searchActivity = this.f31702a;
        int i2 = SearchActivity.f33869w;
        Objects.requireNonNull(searchActivity);
        if (i == 0) {
            string = searchActivity.getString(R.string.title_song);
        } else {
            if (i != 1) {
                throw new IllegalArgumentException(outline.m1590l("Unknown page index: ", i));
            }
            string = searchActivity.getString(R.string.title_member);
        }
        c5969g.m12838b(string);
    }
}
