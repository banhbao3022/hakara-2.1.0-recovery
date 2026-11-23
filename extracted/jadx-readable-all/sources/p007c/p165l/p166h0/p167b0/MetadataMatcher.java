package p007c.p165l.p166h0.p167b0;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p007c.p165l.p166h0.p168c0.p169p.ViewHierarchy;

/* JADX INFO: renamed from: c.l.h0.b0.c, reason: use source file name */
/* JADX INFO: compiled from: MetadataMatcher.java */
/* JADX INFO: loaded from: classes.dex */
public final class MetadataMatcher {
    /* JADX INFO: renamed from: a */
    public static List<String> m2280a(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof EditText) {
            return arrayList;
        }
        if (!(view instanceof TextView)) {
            Iterator it = ((ArrayList) ViewHierarchy.m2297a(view)).iterator();
            while (it.hasNext()) {
                arrayList.addAll(m2280a((View) it.next()));
            }
            return arrayList;
        }
        String string = ((TextView) view).getText().toString();
        if (!string.isEmpty() && string.length() < 100) {
            arrayList.add(string.toLowerCase());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2281b(List<String> list, List<String> list2) {
        boolean z;
        Iterator<String> it = list.iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return false;
            }
            String next = it.next();
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (next.contains(it2.next())) {
                    z = true;
                    break;
                }
            }
        } while (!z);
        return true;
    }
}
