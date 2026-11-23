package p636z0.p770y;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.y.a, reason: use source file name */
/* JADX INFO: compiled from: ActivityNavigator.java */
/* JADX INFO: loaded from: classes.dex */
@Navigator.b("activity")
public class ActivityNavigator extends Navigator<a> {

    /* JADX INFO: renamed from: a */
    public Context f38984a;

    /* JADX INFO: renamed from: b */
    public Activity f38985b;

    /* JADX INFO: renamed from: z0.y.a$a */
    /* JADX INFO: compiled from: ActivityNavigator.java */
    public static class a extends NavDestination {

        /* JADX INFO: renamed from: n */
        public Intent f38986n;

        /* JADX INFO: renamed from: o */
        public String f38987o;

        public a(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends a>) navigatorProvider.m16929c(ActivityNavigator.class));
        }

        @Override // p636z0.p770y.NavDestination
        /* JADX INFO: renamed from: m */
        public void mo462m(Context context, AttributeSet attributeSet) {
            super.mo462m(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C8456s.f39087a);
            String string = typedArrayObtainAttributes.getString(4);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            if (this.f38986n == null) {
                this.f38986n = new Intent();
            }
            this.f38986n.setPackage(string);
            String string2 = typedArrayObtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.f38986n == null) {
                    this.f38986n = new Intent();
                }
                this.f38986n.setComponent(componentName);
            }
            String string3 = typedArrayObtainAttributes.getString(1);
            if (this.f38986n == null) {
                this.f38986n = new Intent();
            }
            this.f38986n.setAction(string3);
            String string4 = typedArrayObtainAttributes.getString(2);
            if (string4 != null) {
                Uri uri = Uri.parse(string4);
                if (this.f38986n == null) {
                    this.f38986n = new Intent();
                }
                this.f38986n.setData(uri);
            }
            this.f38987o = typedArrayObtainAttributes.getString(3);
            typedArrayObtainAttributes.recycle();
        }

        @Override // p636z0.p770y.NavDestination
        public String toString() {
            Intent intent = this.f38986n;
            ComponentName component = intent == null ? null : intent.getComponent();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                Intent intent2 = this.f38986n;
                String action = intent2 != null ? intent2.getAction() : null;
                if (action != null) {
                    sb.append(" action=");
                    sb.append(action);
                }
            }
            return sb.toString();
        }

        public a(Navigator<? extends a> navigator) {
            super(navigator);
        }
    }

    /* JADX INFO: renamed from: z0.y.a$b */
    /* JADX INFO: compiled from: ActivityNavigator.java */
    public static final class b implements Navigator.a {
    }

    public ActivityNavigator(Context context) {
        this.f38984a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f38985b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    @Override // p636z0.p770y.Navigator
    /* JADX INFO: renamed from: a */
    public NavDestination mo457a() {
        return new a(this);
    }

    @Override // p636z0.p770y.Navigator
    /* JADX INFO: renamed from: b */
    public NavDestination mo458b(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.a aVar) {
        Intent intent;
        int intExtra;
        a aVar2 = (a) navDestination;
        if (aVar2.f38986n == null) {
            throw new IllegalStateException(outline.m1603y(outline.m1556G("Destination "), aVar2.f39033h, " does not have an Intent set."));
        }
        Intent intent2 = new Intent(aVar2.f38986n);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = aVar2.f38987o;
            if (!TextUtils.isEmpty(str)) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(bundle.get(strGroup).toString()));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z = aVar instanceof b;
        if (z) {
            Objects.requireNonNull((b) aVar);
            intent2.addFlags(0);
        }
        if (!(this.f38984a instanceof Activity)) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.f39054a) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.f38985b;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar2.f39033h);
        Resources resources = this.f38984a.getResources();
        if (navOptions != null) {
            int i = navOptions.f39059f;
            int i2 = navOptions.f39060g;
            if ((i <= 0 || !resources.getResourceTypeName(i).equals("animator")) && (i2 <= 0 || !resources.getResourceTypeName(i2).equals("animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2);
            } else {
                StringBuilder sbM1556G = outline.m1556G("Activity destinations do not support Animator resource. Ignoring popEnter resource ");
                sbM1556G.append(resources.getResourceName(i));
                sbM1556G.append(" and popExit resource ");
                sbM1556G.append(resources.getResourceName(i2));
                sbM1556G.append("when launching ");
                sbM1556G.append(aVar2);
                Log.w("ActivityNavigator", sbM1556G.toString());
            }
        }
        if (z) {
            Objects.requireNonNull((b) aVar);
            this.f38984a.startActivity(intent2);
        } else {
            this.f38984a.startActivity(intent2);
        }
        if (navOptions == null || this.f38985b == null) {
            return null;
        }
        int i3 = navOptions.f39057d;
        int i4 = navOptions.f39058e;
        if ((i3 <= 0 || !resources.getResourceTypeName(i3).equals("animator")) && (i4 <= 0 || !resources.getResourceTypeName(i4).equals("animator"))) {
            if (i3 < 0 && i4 < 0) {
                return null;
            }
            this.f38985b.overridePendingTransition(Math.max(i3, 0), Math.max(i4, 0));
            return null;
        }
        StringBuilder sbM1556G2 = outline.m1556G("Activity destinations do not support Animator resource. Ignoring enter resource ");
        sbM1556G2.append(resources.getResourceName(i3));
        sbM1556G2.append(" and exit resource ");
        sbM1556G2.append(resources.getResourceName(i4));
        sbM1556G2.append("when launching ");
        sbM1556G2.append(aVar2);
        Log.w("ActivityNavigator", sbM1556G2.toString());
        return null;
    }

    @Override // p636z0.p770y.Navigator
    /* JADX INFO: renamed from: e */
    public boolean mo461e() {
        Activity activity = this.f38985b;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
