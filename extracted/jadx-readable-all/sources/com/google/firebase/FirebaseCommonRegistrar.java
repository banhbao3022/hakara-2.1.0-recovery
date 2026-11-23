package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p385d.p390k.Component3;
import p007c.p190n.p385d.p390k.ComponentContainer;
import p007c.p190n.p385d.p390k.ComponentFactory;
import p007c.p190n.p385d.p390k.ComponentRegistrar;
import p007c.p190n.p385d.p390k.Dependency;
import p007c.p190n.p385d.p417q.DefaultHeartBeatInfo4;
import p007c.p190n.p385d.p417q.HeartBeatConsumer;
import p007c.p190n.p385d.p417q.HeartBeatInfo;
import p007c.p190n.p385d.p429x.LibraryVersion;
import p007c.p190n.p385d.p429x.LibraryVersionComponent2;
import p007c.p190n.p385d.p429x.UserAgentPublisher;
import p477d1.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: renamed from: a */
    public static String m12912a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // p007c.p190n.p385d.p390k.ComponentRegistrar
    public List<Component3<?>> getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        Component3.b bVarM11686a = Component3.m11686a(UserAgentPublisher.class);
        bVarM11686a.m11689a(new Dependency(LibraryVersion.class, 2, 0));
        bVarM11686a.m11691c(new ComponentFactory() { // from class: c.n.d.x.b
            @Override // p007c.p190n.p385d.p390k.ComponentFactory
            /* JADX INFO: renamed from: a */
            public Object mo11679a(ComponentContainer componentContainer) {
                Set setMo11685d = componentContainer.mo11685d(LibraryVersion.class);
                GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = GlobalLibraryVersionRegistrar.f27309a;
                if (globalLibraryVersionRegistrar == null) {
                    synchronized (GlobalLibraryVersionRegistrar.class) {
                        globalLibraryVersionRegistrar = GlobalLibraryVersionRegistrar.f27309a;
                        if (globalLibraryVersionRegistrar == null) {
                            globalLibraryVersionRegistrar = new GlobalLibraryVersionRegistrar();
                            GlobalLibraryVersionRegistrar.f27309a = globalLibraryVersionRegistrar;
                        }
                    }
                }
                return new DefaultUserAgentPublisher2(setMo11685d, globalLibraryVersionRegistrar);
            }
        });
        arrayList.add(bVarM11686a.m11690b());
        int i = DefaultHeartBeatInfo4.f27038a;
        Component3.b bVarM11686a2 = Component3.m11686a(HeartBeatInfo.class);
        bVarM11686a2.m11689a(new Dependency(Context.class, 1, 0));
        bVarM11686a2.m11689a(new Dependency(HeartBeatConsumer.class, 2, 0));
        bVarM11686a2.m11691c(new ComponentFactory() { // from class: c.n.d.q.b
            @Override // p007c.p190n.p385d.p390k.ComponentFactory
            /* JADX INFO: renamed from: a */
            public Object mo11679a(ComponentContainer componentContainer) {
                return new DefaultHeartBeatInfo4((Context) componentContainer.mo11684a(Context.class), componentContainer.mo11685d(HeartBeatConsumer.class));
            }
        });
        arrayList.add(bVarM11686a2.m11690b());
        arrayList.add(C4799a.m11010r("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C4799a.m11010r("fire-core", "19.5.0"));
        arrayList.add(C4799a.m11010r("device-name", m12912a(Build.PRODUCT)));
        arrayList.add(C4799a.m11010r("device-model", m12912a(Build.DEVICE)));
        arrayList.add(C4799a.m11010r("device-brand", m12912a(Build.BRAND)));
        arrayList.add(C4799a.m10957H("android-target-sdk", new LibraryVersionComponent2() { // from class: c.n.d.d
            @Override // p007c.p190n.p385d.p429x.LibraryVersionComponent2
            /* JADX INFO: renamed from: a */
            public String mo11674a(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            }
        }));
        arrayList.add(C4799a.m10957H("android-min-sdk", new LibraryVersionComponent2() { // from class: c.n.d.e
            @Override // p007c.p190n.p385d.p429x.LibraryVersionComponent2
            /* JADX INFO: renamed from: a */
            public String mo11674a(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
            }
        }));
        arrayList.add(C4799a.m10957H("android-platform", new LibraryVersionComponent2() { // from class: c.n.d.f
            @Override // p007c.p190n.p385d.p429x.LibraryVersionComponent2
            /* JADX INFO: renamed from: a */
            public String mo11674a(Object obj) {
                Context context = (Context) obj;
                int i2 = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (i2 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return (i2 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
                }
                return "auto";
            }
        }));
        arrayList.add(C4799a.m10957H("android-installer", new LibraryVersionComponent2() { // from class: c.n.d.g
            @Override // p007c.p190n.p385d.p429x.LibraryVersionComponent2
            /* JADX INFO: renamed from: a */
            public String mo11674a(Object obj) {
                Context context = (Context) obj;
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.m12912a(installerPackageName) : "";
            }
        }));
        try {
            string = KotlinVersion.f29478f.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(C4799a.m11010r("kotlin", string));
        }
        return arrayList;
    }
}
