package p555j.p556a.p557a.p558a.p559a.p585o;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Keyword;
import mtp.media.karaoke.p628ui.screen.search.SearchActivity;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.o.a, reason: use source file name */
/* JADX INFO: compiled from: SearchActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SearchActivity2<T> implements Observer<ArrayList<Keyword>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchActivity f31699a;

    public SearchActivity2(SearchActivity searchActivity) {
        this.f31699a = searchActivity;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(ArrayList<Keyword> arrayList) {
        ArrayList<Keyword> arrayList2 = arrayList;
        if (!Intrinsics2.m13085a(this.f31699a.f33872C, "")) {
            this.f31699a.f33871B.m13977p(arrayList2);
            RecyclerView recyclerView = (RecyclerView) this.f31699a.m14431U(R.id.recyclerSuggest);
            Intrinsics2.m13088d(recyclerView, "recyclerSuggest");
            SkuDao.a.m14068T(recyclerView);
            LinearLayout linearLayout = (LinearLayout) this.f31699a.m14431U(R.id.layoutSearchPage);
            Intrinsics2.m13088d(linearLayout, "layoutSearchPage");
            SkuDao.a.m14109v(linearLayout);
            return;
        }
        this.f31699a.f33871B.m13977p(null);
        RecyclerView recyclerView2 = (RecyclerView) this.f31699a.m14431U(R.id.recyclerSuggest);
        Intrinsics2.m13088d(recyclerView2, "recyclerSuggest");
        SkuDao.a.m14109v(recyclerView2);
        LinearLayout linearLayout2 = (LinearLayout) this.f31699a.m14431U(R.id.layoutSearchPage);
        Intrinsics2.m13088d(linearLayout2, "layoutSearchPage");
        SkuDao.a.m14068T(linearLayout2);
    }
}
