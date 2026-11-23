package p636z0.p644b.p645c;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.p653h.AppCompatAutoCompleteTextView;
import p636z0.p644b.p653h.AppCompatButton;
import p636z0.p644b.p653h.AppCompatCheckBox;
import p636z0.p644b.p653h.AppCompatRadioButton;
import p636z0.p644b.p653h.AppCompatTextView;
import p636z0.p691g.SimpleArrayMap;

/* JADX INFO: renamed from: z0.b.c.r, reason: use source file name */
/* JADX INFO: compiled from: AppCompatViewInflater.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatViewInflater {

    /* JADX INFO: renamed from: a */
    public static final Class<?>[] f34521a = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: b */
    public static final int[] f34522b = {R.attr.onClick};

    /* JADX INFO: renamed from: c */
    public static final String[] f34523c = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: d */
    public static final SimpleArrayMap<String, Constructor<? extends View>> f34524d = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: e */
    public final Object[] f34525e = new Object[2];

    /* JADX INFO: renamed from: z0.b.c.r$a */
    /* JADX INFO: compiled from: AppCompatViewInflater.java */
    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: f */
        public final View f34526f;

        /* JADX INFO: renamed from: g */
        public final String f34527g;

        /* JADX INFO: renamed from: h */
        public Method f34528h;

        /* JADX INFO: renamed from: i */
        public Context f34529i;

        public a(View view, String str) {
            this.f34526f = view;
            this.f34527g = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String string;
            Method method;
            if (this.f34528h != null) {
                break;
            }
            Context context = this.f34526f.getContext();
            while (true) {
                if (context == null) {
                    int id = this.f34526f.getId();
                    if (id == -1) {
                        string = "";
                    } else {
                        StringBuilder sbM1556G = outline.m1556G(" with id '");
                        sbM1556G.append(this.f34526f.getContext().getResources().getResourceEntryName(id));
                        sbM1556G.append("'");
                        string = sbM1556G.toString();
                    }
                    StringBuilder sbM1556G2 = outline.m1556G("Could not find method ");
                    sbM1556G2.append(this.f34527g);
                    sbM1556G2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbM1556G2.append(this.f34526f.getClass());
                    sbM1556G2.append(string);
                    throw new IllegalStateException(sbM1556G2.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f34527g, View.class)) != null) {
                        this.f34528h = method;
                        this.f34529i = context;
                        break;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            try {
                this.f34528h.invoke(this.f34529i, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public AppCompatAutoCompleteTextView mo12882a(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public AppCompatButton mo12883b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public AppCompatCheckBox mo12884c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    public AppCompatRadioButton mo12885d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public AppCompatTextView mo12886e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public View m14680f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final View m14681g(Context context, String str, String str2) throws InflateException, ClassNotFoundException {
        String str3;
        SimpleArrayMap<String, Constructor<? extends View>> simpleArrayMap = f34524d;
        Constructor<? extends View> orDefault = simpleArrayMap.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f34521a);
            simpleArrayMap.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f34525e);
    }

    /* JADX INFO: renamed from: h */
    public final void m14682h(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
