package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2665i;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2668j;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {

    /* JADX INFO: renamed from: f */
    @RecentlyNonNull
    public final InterfaceC2668j f28672f;

    public LifecycleCallback(@RecentlyNonNull InterfaceC2668j interfaceC2668j) {
        this.f28672f = interfaceC2668j;
    }

    @Keep
    private static InterfaceC2668j getChimeraLifecycleFragmentImpl(C2665i c2665i) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* JADX INFO: renamed from: a */
    public void m12662a() {
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: b */
    public Activity m12663b() {
        return this.f28672f.mo5542f();
    }

    /* JADX INFO: renamed from: c */
    public void mo5504c(int i, int i2, @RecentlyNonNull Intent intent) {
    }

    /* JADX INFO: renamed from: d */
    public void mo5505d(Bundle bundle) {
    }

    /* JADX INFO: renamed from: e */
    public void mo5554e() {
    }

    /* JADX INFO: renamed from: f */
    public void mo5506f(@RecentlyNonNull Bundle bundle) {
    }

    /* JADX INFO: renamed from: g */
    public void mo5555g() {
    }

    /* JADX INFO: renamed from: h */
    public void mo5556h() {
    }
}
