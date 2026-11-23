package p007c.p165l.p166h0.p168c0.p169p;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Utility;
import p636z0.p725k.p739l.NestedScrollingChild;

/* JADX INFO: renamed from: c.l.h0.c0.p.e, reason: use source file name */
/* JADX INFO: compiled from: ViewHierarchy.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewHierarchy {

    /* JADX INFO: renamed from: a */
    public static final String f4689a = "c.l.h0.c0.p.e";

    /* JADX INFO: renamed from: b */
    public static WeakReference<View> f4690b = new WeakReference<>(null);

    /* JADX INFO: renamed from: c */
    public static Method f4691c = null;

    /* JADX INFO: renamed from: a */
    public static List<View> m2297a(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static int m2298b(View view) {
        int i = view instanceof ImageView ? 2 : 0;
        if (view.isClickable()) {
            i |= 32;
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof AdapterView) || (parent instanceof NestedScrollingChild)) {
            i |= 512;
        }
        if (view instanceof TextView) {
            int i2 = i | 1024 | 1;
            if (view instanceof Button) {
                i2 |= 4;
                if (view instanceof Switch) {
                    i2 |= 8192;
                } else if (view instanceof CheckBox) {
                    i2 |= 32768;
                }
            }
            return view instanceof EditText ? i2 | 2048 : i2;
        }
        if ((view instanceof Spinner) || (view instanceof DatePicker)) {
            return i | 4096;
        }
        if (view instanceof RatingBar) {
            return i | 65536;
        }
        if (view instanceof RadioGroup) {
            return i | 16384;
        }
        return ((view instanceof ViewGroup) && m2305i(view, f4690b.get())) ? i | 64 : i;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m2299c(View view) {
        if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
            f4690b = new WeakReference<>(view);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            m2306j(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<View> listM2297a = m2297a(view);
            int i = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) listM2297a;
                if (i >= arrayList.size()) {
                    break;
                }
                jSONArray.put(m2299c((View) arrayList.get(i)));
                i++;
            }
            jSONObject.put("childviews", jSONArray);
        } catch (JSONException e) {
            Log.e(f4689a, "Failed to create JSONObject for view.", e);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m2300d(View view) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("top", view.getTop());
            jSONObject.put("left", view.getLeft());
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("scrollx", view.getScrollX());
            jSONObject.put("scrolly", view.getScrollY());
            jSONObject.put("visibility", view.getVisibility());
        } catch (JSONException e) {
            Log.e(f4689a, "Failed to create JSONObject for dimension.", e);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: e */
    public static View.OnClickListener m2301e(View view) {
        Field declaredField;
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnClickListener) declaredField.get(obj);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static View.OnTouchListener m2302f(View view) {
        Field declaredField;
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnTouchListener) declaredField.get(obj);
        } catch (ClassNotFoundException unused) {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            return null;
        } catch (IllegalAccessException unused2) {
            HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
            return null;
        } catch (NoSuchFieldException unused3) {
            HashSet<LoggingBehavior> hashSet3 = FacebookSdk.f5352a;
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m2303g(View view) {
        CharSequence hint;
        if (view instanceof EditText) {
            hint = ((EditText) view).getHint();
        } else {
            hint = view instanceof TextView ? ((TextView) view).getHint() : null;
        }
        return hint == null ? "" : hint.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m2304h(View view) {
        CharSequence text;
        Object selectedItem;
        CharSequence charSequenceValueOf = null;
        if (view instanceof TextView) {
            charSequenceValueOf = ((TextView) view).getText();
            if (view instanceof Switch) {
                text = ((Switch) view).isChecked() ? "1" : "0";
                charSequenceValueOf = text;
                break;
            }
        } else if (view instanceof Spinner) {
            Spinner spinner = (Spinner) view;
            if (spinner.getCount() > 0 && (selectedItem = spinner.getSelectedItem()) != null) {
                charSequenceValueOf = selectedItem.toString();
            }
        } else {
            if (view instanceof DatePicker) {
                DatePicker datePicker = (DatePicker) view;
                charSequenceValueOf = String.format("%04d-%02d-%02d", Integer.valueOf(datePicker.getYear()), Integer.valueOf(datePicker.getMonth()), Integer.valueOf(datePicker.getDayOfMonth()));
            } else if (view instanceof TimePicker) {
                TimePicker timePicker = (TimePicker) view;
                charSequenceValueOf = String.format("%02d:%02d", Integer.valueOf(timePicker.getCurrentHour().intValue()), Integer.valueOf(timePicker.getCurrentMinute().intValue()));
            } else if (view instanceof RadioGroup) {
                RadioGroup radioGroup = (RadioGroup) view;
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                int childCount = radioGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = radioGroup.getChildAt(i);
                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                        text = ((RadioButton) childAt).getText();
                        charSequenceValueOf = text;
                        break;
                    }
                }
            } else if (view instanceof RatingBar) {
                charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
            }
        }
        return charSequenceValueOf == null ? "" : charSequenceValueOf.toString();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2305i(View view, View view2) {
        View view3;
        if (view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            float[] fArr = {iArr[0], iArr[1]};
            if (f4691c == null) {
                try {
                    Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                    f4691c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (ClassNotFoundException unused) {
                    HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                } catch (NoSuchMethodException unused2) {
                    HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
                }
            }
            Method method = f4691c;
            View view4 = null;
            if (method != null && view2 != null) {
                try {
                    View view5 = (View) method.invoke(null, fArr, view2);
                    if (view5 != null && view5.getId() > 0 && (view3 = (View) view5.getParent()) != null) {
                        view4 = view3;
                    }
                } catch (IllegalAccessException unused3) {
                    HashSet<LoggingBehavior> hashSet3 = FacebookSdk.f5352a;
                } catch (InvocationTargetException unused4) {
                    HashSet<LoggingBehavior> hashSet4 = FacebookSdk.f5352a;
                }
            }
            if (view4 != null && view4.getId() == view.getId()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static void m2306j(View view, JSONObject jSONObject) {
        try {
            String strM2304h = m2304h(view);
            String strM2303g = m2303g(view);
            Object tag = view.getTag();
            CharSequence contentDescription = view.getContentDescription();
            jSONObject.put("classname", view.getClass().getCanonicalName());
            jSONObject.put("classtypebitmask", m2298b(view));
            jSONObject.put("id", view.getId());
            if (SensitiveUserDataUtils.m2296a(view)) {
                jSONObject.put("text", "");
                jSONObject.put("is_user_input", true);
            } else {
                jSONObject.put("text", Utility.m2446e(Utility.m2440M(strM2304h), ""));
            }
            jSONObject.put("hint", Utility.m2446e(Utility.m2440M(strM2303g), ""));
            if (tag != null) {
                jSONObject.put("tag", Utility.m2446e(Utility.m2440M(tag.toString()), ""));
            }
            if (contentDescription != null) {
                jSONObject.put(CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION, Utility.m2446e(Utility.m2440M(contentDescription.toString()), ""));
            }
            jSONObject.put("dimension", m2300d(view));
        } catch (JSONException unused) {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        }
    }
}
