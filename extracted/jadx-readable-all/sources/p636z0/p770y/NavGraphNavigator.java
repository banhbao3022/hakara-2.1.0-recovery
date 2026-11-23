package p636z0.p770y;

import android.os.Bundle;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.y.l, reason: use source file name */
/* JADX INFO: compiled from: NavGraphNavigator.java */
/* JADX INFO: loaded from: classes.dex */
@Navigator.b("navigation")
public class NavGraphNavigator extends Navigator<NavGraph> {

    /* JADX INFO: renamed from: a */
    public final NavigatorProvider f39050a;

    public NavGraphNavigator(NavigatorProvider navigatorProvider) {
        this.f39050a = navigatorProvider;
    }

    @Override // p636z0.p770y.Navigator
    /* JADX INFO: renamed from: a */
    public NavDestination mo457a() {
        return new NavGraph(this);
    }

    @Override // p636z0.p770y.Navigator
    /* JADX INFO: renamed from: b */
    public NavDestination mo458b(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.a aVar) {
        String str;
        NavGraph navGraph = (NavGraph) navDestination;
        int i = navGraph.f39045o;
        if (i != 0) {
            NavDestination navDestinationM16914t = navGraph.m16914t(i, false);
            if (navDestinationM16914t != null) {
                return this.f39050a.m16930d(navDestinationM16914t.f39031f).mo458b(navDestinationM16914t, navDestinationM16914t.m16908c(bundle), navOptions, aVar);
            }
            if (navGraph.f39046p == null) {
                navGraph.f39046p = Integer.toString(navGraph.f39045o);
            }
            throw new IllegalArgumentException(outline.m1600v("navigation destination ", navGraph.f39046p, " is not a direct child of this NavGraph"));
        }
        StringBuilder sbM1556G = outline.m1556G("no start destination defined via app:startDestination for ");
        int i2 = navGraph.f39033h;
        if (i2 != 0) {
            if (navGraph.f39034i == null) {
                navGraph.f39034i = Integer.toString(i2);
            }
            str = navGraph.f39034i;
        } else {
            str = "the root navigation";
        }
        sbM1556G.append(str);
        throw new IllegalStateException(sbM1556G.toString());
    }

    @Override // p636z0.p770y.Navigator
    /* JADX INFO: renamed from: e */
    public boolean mo461e() {
        return true;
    }
}
