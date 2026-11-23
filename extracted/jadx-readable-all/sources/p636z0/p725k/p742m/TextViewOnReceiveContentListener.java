package p636z0.p725k.p742m;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p636z0.p725k.p739l.ContentInfoCompat;
import p636z0.p725k.p739l.OnReceiveContentListener;

/* JADX INFO: renamed from: z0.k.m.e, reason: use source file name */
/* JADX INFO: compiled from: TextViewOnReceiveContentListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class TextViewOnReceiveContentListener implements OnReceiveContentListener {
    /* JADX INFO: renamed from: b */
    public static CharSequence m16361b(Context context, ClipData.Item item, int i) {
        if ((i & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence charSequenceCoerceToText = item.coerceToText(context);
        return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
    }

    /* JADX INFO: renamed from: c */
    public static void m16362c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // p636z0.p725k.p739l.OnReceiveContentListener
    /* JADX INFO: renamed from: a */
    public ContentInfoCompat mo16303a(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + contentInfoCompat);
        }
        int i = contentInfoCompat.f38038b;
        if (i == 2) {
            return contentInfoCompat;
        }
        int i2 = 0;
        if (i == 3) {
            TextView textView = (TextView) view;
            ClipData clipData = contentInfoCompat.f38037a;
            Context context = textView.getContext();
            int i3 = contentInfoCompat.f38039c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            while (i2 < clipData.getItemCount()) {
                CharSequence charSequenceM16361b = m16361b(context, clipData.getItemAt(i2), i3);
                if (charSequenceM16361b != null) {
                    spannableStringBuilder.append(charSequenceM16361b);
                }
                i2++;
            }
            m16362c((Editable) textView.getText(), spannableStringBuilder);
            return null;
        }
        ClipData clipData2 = contentInfoCompat.f38037a;
        int i4 = contentInfoCompat.f38039c;
        TextView textView2 = (TextView) view;
        Editable editable = (Editable) textView2.getText();
        Context context2 = textView2.getContext();
        boolean z = false;
        while (i2 < clipData2.getItemCount()) {
            CharSequence charSequenceM16361b2 = m16361b(context2, clipData2.getItemAt(i2), i4);
            if (charSequenceM16361b2 != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceM16361b2);
                } else {
                    m16362c(editable, charSequenceM16361b2);
                    z = true;
                }
            }
            i2++;
        }
        return null;
    }
}
