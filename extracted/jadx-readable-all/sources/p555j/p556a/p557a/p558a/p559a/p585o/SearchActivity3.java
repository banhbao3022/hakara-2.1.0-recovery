package p555j.p556a.p557a.p558a.p559a.p585o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import me.gujun.android.taggroup.TagGroup;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Keyword;
import mtp.media.karaoke.p628ui.screen.search.SearchActivity;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.o.b, reason: use source file name */
/* JADX INFO: compiled from: SearchActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SearchActivity3<T> implements Observer<ArrayList<Keyword>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchActivity f31700a;

    public SearchActivity3(SearchActivity searchActivity) {
        this.f31700a = searchActivity;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(ArrayList<Keyword> arrayList) {
        ArrayList<Keyword> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        if (arrayList2 != null) {
            Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                String name = ((Keyword) it.next()).getName();
                Locale locale = Locale.ROOT;
                Intrinsics2.m13088d(locale, "Locale.ROOT");
                arrayList3.add(StringsJVM.m12987d(name, locale));
            }
        }
        ((TagGroup) this.f31700a.m14431U(R.id.tagGroup)).setTags(arrayList3);
    }
}
