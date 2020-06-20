The Contacts Contract Content Provider includes an Intent-based mechanism that can be used to view, insert, or select a contact using an existing contact application.
To display a list of contacts for your users to select from, you can use the Intent.ACTION_PICK action along with the ContactsContract.Contacts.CONTENT_URI,
private static int PICK_CONTACT = 0;
private void pickContact() {
Intent intent = new Intent(Intent.ACTION_PICK,
ContactsContract.Contacts.CONTENT_URI);
startActivityForResult(intent, PICK_CONTACT);
}
