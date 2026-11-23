package p007c.p165l.p166h0.p174h0;

import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.p166h0.p168c0.p169p.ViewHierarchy;

/* JADX INFO: renamed from: c.l.h0.h0.c, reason: use source file name */
/* JADX INFO: compiled from: SuggestedEventViewHierarchy.java */
/* JADX INFO: loaded from: classes.dex */
public class SuggestedEventViewHierarchy {

    /* JADX INFO: renamed from: a */
    public static final List<Class<? extends View>> f4810a = new ArrayList(Arrays.asList(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class));

    /* JADX INFO: renamed from: a */
    public static List<View> m2347a(View view) {
        ArrayList arrayList = new ArrayList();
        Iterator<Class<? extends View>> it = f4810a.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(view)) {
                return arrayList;
            }
        }
        if (view.isClickable()) {
            arrayList.add(view);
        }
        Iterator it2 = ((ArrayList) ViewHierarchy.m2297a(view)).iterator();
        while (it2.hasNext()) {
            arrayList.addAll(m2347a((View) it2.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m2348b(View view, View view2) {
        JSONObject jSONObject = new JSONObject();
        if (view == view2) {
            try {
                jSONObject.put("is_interacted", true);
            } catch (JSONException unused) {
            }
        }
        m2349c(view, jSONObject);
        JSONArray jSONArray = new JSONArray();
        List<View> listM2297a = ViewHierarchy.m2297a(view);
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) listM2297a;
            if (i >= arrayList.size()) {
                break;
            }
            jSONArray.put(m2348b((View) arrayList.get(i), view2));
            i++;
        }
        jSONObject.put("childviews", jSONArray);
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static void m2349c(View view, JSONObject jSONObject) {
        try {
            String strM2304h = ViewHierarchy.m2304h(view);
            String strM2303g = ViewHierarchy.m2303g(view);
            jSONObject.put("classname", view.getClass().getSimpleName());
            jSONObject.put("classtypebitmask", ViewHierarchy.m2298b(view));
            if (!strM2304h.isEmpty()) {
                jSONObject.put("text", strM2304h);
            }
            if (!strM2303g.isEmpty()) {
                jSONObject.put("hint", strM2303g);
            }
            if (view instanceof EditText) {
                jSONObject.put("inputtype", ((EditText) view).getInputType());
            }
        } catch (JSONException unused) {
        }
    }
}
