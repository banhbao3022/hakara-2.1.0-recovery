package p636z0.p725k.p736i;

import java.util.ArrayList;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p725k.p738k.Consumer2;

/* JADX INFO: renamed from: z0.k.i.i, reason: use source file name */
/* JADX INFO: compiled from: FontRequestWorker.java */
/* JADX INFO: loaded from: classes.dex */
public class FontRequestWorker4 implements Consumer2<FontRequestWorker5.a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f37917a;

    public FontRequestWorker4(String str) {
        this.f37917a = str;
    }

    @Override // p636z0.p725k.p738k.Consumer2
    /* JADX INFO: renamed from: a */
    public void mo2060a(FontRequestWorker5.a aVar) {
        FontRequestWorker5.a aVar2 = aVar;
        synchronized (FontRequestWorker5.f37920c) {
            SimpleArrayMap<String, ArrayList<Consumer2<FontRequestWorker5.a>>> simpleArrayMap = FontRequestWorker5.f37921d;
            ArrayList<Consumer2<FontRequestWorker5.a>> arrayList = simpleArrayMap.get(this.f37917a);
            if (arrayList == null) {
                return;
            }
            simpleArrayMap.remove(this.f37917a);
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.get(i).mo2060a(aVar2);
            }
        }
    }
}
