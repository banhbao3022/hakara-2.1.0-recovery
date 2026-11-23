package com.cgfay.camera.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import java.lang.ref.WeakReference;
import mtp.media.karaoke.R;
import p636z0.p644b.p653h.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public class RecordCountDownView extends AppCompatTextView {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f28161k = 0;

    /* JADX INFO: renamed from: l */
    public int f28162l;

    /* JADX INFO: renamed from: m */
    public InterfaceC5782b f28163m;

    /* JADX INFO: renamed from: n */
    public final HandlerC5781a f28164n;

    /* JADX INFO: renamed from: com.cgfay.camera.widget.RecordCountDownView$a */
    public static class HandlerC5781a extends Handler {

        /* JADX INFO: renamed from: a */
        public final WeakReference<RecordCountDownView> f28165a;

        public HandlerC5781a(RecordCountDownView recordCountDownView) {
            this.f28165a = new WeakReference<>(recordCountDownView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f28165a.get() == null) {
                return;
            }
            RecordCountDownView recordCountDownView = this.f28165a.get();
            if (message.what != 1) {
                return;
            }
            int i = message.arg1;
            if (i > 0) {
                recordCountDownView.setText(String.valueOf(i));
                int i2 = RecordCountDownView.f28161k;
                recordCountDownView.startAnimation(AnimationUtils.loadAnimation(recordCountDownView.getContext(), R.anim.anim_fade_in));
                sendMessageDelayed(obtainMessage(1, message.arg1 - 1, 0), 1000L);
                return;
            }
            recordCountDownView.setText("");
            InterfaceC5782b interfaceC5782b = recordCountDownView.f28163m;
            if (interfaceC5782b != null) {
                interfaceC5782b.mo12567a();
            }
        }
    }

    /* JADX INFO: renamed from: com.cgfay.camera.widget.RecordCountDownView$b */
    public interface InterfaceC5782b {
        /* JADX INFO: renamed from: a */
        void mo12567a();

        /* JADX INFO: renamed from: b */
        void mo12568b();
    }

    public RecordCountDownView(Context context) {
        this(context, null);
    }

    public void setCountDown(int i) {
        this.f28162l = i;
    }

    public RecordCountDownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecordCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28162l = 3;
        setGravity(17);
        this.f28164n = new HandlerC5781a(this);
    }
}
