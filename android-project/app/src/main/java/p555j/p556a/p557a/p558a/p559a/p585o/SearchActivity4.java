package p555j.p556a.p557a.p558a.p559a.p585o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.gujun.android.taggroup.TagGroup;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.search.SearchActivity;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p611b.KeywordEntity;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.o.c, reason: use source file name */
/* JADX INFO: compiled from: SearchActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SearchActivity4<T> implements Observer<List<? extends KeywordEntity>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchActivity f31701a;

    public SearchActivity4(SearchActivity searchActivity) {
        this.f31701a = searchActivity;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(List<? extends KeywordEntity> list) {
        List<? extends KeywordEntity> list2 = list;
        ArrayList arrayList = new ArrayList();
        Intrinsics2.m13088d(list2, "it");
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String str = ((KeywordEntity) it.next()).f32324g;
            Locale locale = Locale.ROOT;
            Intrinsics2.m13088d(locale, "Locale.ROOT");
            arrayList.add(StringsJVM.m12987d(str, locale));
        }
        ((TagGroup) this.f31701a.m14431U(R.id.tagGroupRecent)).setTags(arrayList);
    }
}
